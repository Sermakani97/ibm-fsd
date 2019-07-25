const server = require('express').Router();
const PService = require('../services/prdtService').PrdtService;
const prdtService = new PService();
const setContentHeader = require('../services/utils').setContentHeader;

// get all users
server.get('/', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        prdt: prdtService._all()
    }));
});

// add a new user
server.post('/add', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        prdt: prdtService._add(req.body)
    }));
});

module.exports.userRoutes = server;