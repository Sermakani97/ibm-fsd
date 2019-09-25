const server = require('express').Router();
const userservice = require('../services/userservice').userservice;
const uservice = new userservice()


server.get('/', (rq, rs) => {
    rs.status(200).json({

        message: 'security service is running'
    })
})
server.post('/add', (rq, rs) => {
    uservice.add(rq.body, (err, rs) => {
        if (err) {
            message: "unable to send"
        }
        else {

            products: 'added succesfully'
        }
    })
})

module.exports.userApi = server;