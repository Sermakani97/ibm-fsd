const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
// const authenticate = require('./services/security').authenticate;
const userRoutes = require('./apis/prdt').userRoutes;
const associateRoutes = require('./apis/cart').associateRoutes;
const setContentHeader = require('./services/utils').setContentHeader;
// apply json parser
server.use(parser.json());
// apply cors
server.use(cors());
server.get('/status', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        message: "Server is RUNNING"
    }));
});
// add routes to server
server.use('/prdt', userRoutes);
server.use('/cart', associateRoutes);

// PORT Binding
server.listen(1269, () => {
    console.log('Server started at 1269');
});