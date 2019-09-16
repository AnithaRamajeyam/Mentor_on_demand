export class Mentor{
    mentor_id:number;
    password:String;
    email:String;
    username:String;
    linkedin_url:String;
    reg_datetime:Date;
    reg_code:String;
    active:boolean;
    year_of_experience:number;
    skill_id:number;
    self_rating:number;
    years_of_exp:number;
    facilities_offered:String;
    
    constructor ( email,password,username,linkedin_url, reg_datetime,reg_code, active,year_of_experience,mentor_id?) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.linkedin_url=linkedin_url;
        this.reg_datetime = reg_datetime;
        this.reg_code = reg_code;
        this.active = active;
        this.year_of_experience=year_of_experience;
        this.mentor_id=mentor_id;
    }

}