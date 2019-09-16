export class User{
    user_id:number;
    first_name:String;
    last_name:String;
    active:String;
    email:String;
    password:String;
    reg_code:String;
    reg_date:Date;
    contact_no:String;


    constructor ( email,password,first_name,last_name,contact_no, active, reg_code,reg_date,user_id?) {
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name=last_name;
        this.contact_no=contact_no;
        this.reg_date=reg_date;
        this.reg_code = reg_code;
        this.active = active;
        this.user_id=user_id;
    }
}