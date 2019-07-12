
function checkbox()
{
    var checkbox=document.getElementByName=('skill');
var checkboxcheck=[];
for(var i=0;i<checkbox.length;i++){
if(checkbox[i].checked)
{
    checkboxcheck.push(checkbox[i].value);
}}
document.getElementById("skills").value=checkboxcheck;
}
const save=()=>
{
    const trainer=new Timetable();
    trainer.setup(
        document.getElementById('id').value,
           document.getElementById('name').value,
           document.getElementById('skills').value
           );
           trainer._add();
    
           
fetchAllTrainer();
}
const fetchAllTrainer = ()=>{
    

    const trainer = new Timetable();

    const tr= trainer._all();

    buildTable(tr);

    

}

const searchClass = () =>{

    const trainer = new Timetable();

    const table= trainer._filter(

                        document.getElementById('searchBy').value

                    );

    buildTable(table);

}
const searchSlot = () =>{

    const trainer = new Timetable();

    const table= trainer._filter1(

                        document.getElementById('searchBy').value

                    );

    buildTable(table);

}


const editTrainer=()=>
{
    const trainer=new Timetable();
    let tra=trainer._edit();
    document.getElementById('id').value=tra.name;
    document.getElementById('name').value=tra.sub;
    document.getElementById('sub').value=tra.sub;


}

const buildTable = (tr) =>{

    const timeBody = document.getElementById('trainer-details');

    let rows = '';

    tr.forEach((trainer)=>{

        rows += `<tr>
        <td>${trainer.id}</td>

                    <td>${trainer.name}</td>

                    <td>${trainer.sub}</td>
                    <td><a href='#' onclick="editTrainer('${trainer.id}')">edit</a></td>
                </tr>`

    });
    timeBody.innerHTML = rows;

}


class Timetable {
    id
    name
    sub
    setup(id,name,skills){

        this.id=id;
        this.name = name
            this.skills= skills
    }



_all(){

    const tr= [];

    // fill up Array

    Object.keys(localStorage).forEach((storeKey)=>{

        tr.push(JSON.parse(localStorage.getItem(storeKey)));

    });

    return tr;

}

_filter(searchBy){

    let tr= [];

    // fill up Array

        if(searchBy == 'Class A'){

                Object.keys(localStorage).forEach((e)=>{

                    const _trainer = JSON.parse(localStorage.getItem(e));
                    const _sub=JSON.parse(localStorage.getItem(e));
                });

            }

            else if( searchBy == 'Class B'){

                    Object.keys(localStorage).forEach((e)=>{

                        const _trainer = JSON.parse(localStorage.getItem(e));
                        const _sub=JSON.parse(localStorage.getItem(e));
                   });

        }

    return tr;

}
_filter1(searchBy){

    let tr= [];

    // fill up Array

        if(searchBy == 'slot A'){

                Object.keys(localStorage).forEach((e)=>{

                    const _trainer = JSON.parse(localStorage.getItem(e));
                    const _sub=JSON.parse(localStorage.getItem(e));
                });

            }

            else if( searchBy == 'slot B'){

                    Object.keys(localStorage).forEach((e)=>{

                        const _trainer = JSON.parse(localStorage.getItem(e));
                        const _sub=JSON.parse(localStorage.getItem(e));
                   });

        }

    return tr;

}


_add(){
    
    localStorage.setItem(this.id,JSON.stringify({
        id:this.id,
        name : this.name,

        sub : this.sub
    }));
}
_edit(){
    return JSON.parse(localStorage.getItem());
}
}