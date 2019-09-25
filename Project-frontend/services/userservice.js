const Mongoclient = require('mongodb').MongoClient;
const UserConstants = require('./util.service').UserConstants;
class userservice {
    fetchUsers(callback) {

        MongoClient.connect(UserConstants.mongo.url, (err, conn) => {

            conn.db(UserConstants.mongo.db).collection('users').find({}).toArray((error, users) => {

                if (!error) {

                    console.log(users);

                    callback(users);
                }

            });

        });

    }
    add(_user, callback) {

        MongoClient.connect(UserConstants.mongo.url, (err, conn) => {

            conn.db(UserConstants.mongo.db).collection('users').insert(_user, (err, response) => {

                callback(err, response);

            });

        });

    }

}

module.exports = {
    userservice
}