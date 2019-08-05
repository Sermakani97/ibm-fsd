const users = require('../dbs/users').users;
let otp = require('otp-generator');
const Email = require('./email.service').Email;
const emailService = new Email();
class Service {
    constructor() {
        this.users = users
    }
    register(user) {

        this.email(user);

        this.users.push(user);

    }

    getAllUsers() {

        return this.users;

    }
    otp_generator() {
        const otp_password = otp.generate(8);
        console.log(otp_password);
        return otp_password;
    }

    email(user) {
        let userObj = {
            subject: "User Registration",
            body: `<div>Dear <b>${user.name}</b></div>
                    <div>Thank you for registering</div>
                    <div><b>${this.otp_generator()}</b></div>`,
            from: null,
            to: user.email
        }
        emailService.email(userObj)
    }
}
module.exports.Service = Service;