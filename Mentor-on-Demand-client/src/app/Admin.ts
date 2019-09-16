export class Admin{
    id:number
    email:String;
    password:String;

    constructor ( email,password,id?) {
        this.email = email;
        this.password = password;
        this.id=id;
    }
}