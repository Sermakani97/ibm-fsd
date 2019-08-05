const express = require('express');
const server = express();
const parser = require('body-parser');
const useRoutes = require('./routes/users').useRoutes;
server.use(parser.json());
server.get('/status', (rq, rs) => {
    rs.status(200).json({
        message: 'Service is running'
    });
});
// map user routes

server.use('/users', useRoutes);
//PORT
const PORT = 6668;
server.listen(PORT, () => {
    console.log(`Server Started at ${PORT}`);

});
module.exports.server = server;