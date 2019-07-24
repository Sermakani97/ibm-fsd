const prdt = require('../db/prdt').prdt;
class PrdtService {
    // users=[];
    constructor() {
        this.prdt = prdt;
    }
    _all() {
        return this.prdt;
    }
    _add(prdt) {
        this.prdt.push(prdt);
        return this.prdt;
    }

}

module.exports.PrdtService = PrdtService;