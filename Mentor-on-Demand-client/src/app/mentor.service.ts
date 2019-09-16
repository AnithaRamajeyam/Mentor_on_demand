import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from  './Login';
import { Observable } from 'rxjs';
import { User } from './User';
@Injectable({
  providedIn: 'root'
})
export class MentorService {
 
 baseLoginUrl= 'http://localhost:8089/api/login/get';
 
  getMentorCredentials(): Observable<any> {
    return this.http.get<any>(`${this.baseLoginUrl}`+`/Mentor`);
  }
  getUserCredentials(): Observable<any> {
    return this.http.get<any>(`${this.baseLoginUrl}`+`/User`);
  }
  getAdminCredentials(): Observable<any> {
    return this.http.get<any>(`${this.baseLoginUrl}`+`/Admin`);
  }
  insertCredentials(credential: Login):Observable<object> {
    return this.http.post(`${this.baseUrl}` + `/credentials`, credential);
  }

 

  constructor(private http: HttpClient) { }
  private baseUrl= 'http://localhost:8089/api/mentor';
  getCompletedTrainings(mentor_id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}`+ `/getCompleted/${mentor_id}`);
  }

  getOnProgressTrainings(mentor_id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}`+`/getOnProgress/${mentor_id}`);
  }

  private baseUrl2= 'http://localhost:8089/api';
  getProposals(mentor:object):Observable<any> {
    return this.http.put(`${this.baseUrl2}`+`/trainings/create`,mentor);
  }
  getMentorProposals(mentor_id: number): Observable<any> {
    console.log(mentor_id)
    return this.http.get(`${this.baseUrl}`+`/viewProposals/${mentor_id}`);
  }

  private baseUrlMentor = 'http://localhost:8089/api/mentor/getDetails';
  getMentorById(mentor_id: number): Observable<any> {
    return this.http.get(`${this.baseUrlMentor}/${mentor_id}`);
  }
  private baseUrlapprove = 'http://localhost:8089/api/trainings';
  approveProposal( tid:number,value: any): Observable<Object> {
    return this.http.put(`${this.baseUrlapprove}`+`/getApproval/${tid}`, value);
  }
  
  private baseUrlreject = 'http://localhost:8089/api/trainings';
  rejectProposal( tid:number,value: any): Observable<any> {
    return this.http.put(`${this.baseUrlreject}`+`/rejectProposal/${tid}`, value);
  }

  private baseUrlgetapprove = 'http://localhost:8089/api/user';
  getApproveProposals(user_id:number): Observable<any> {
    return this.http.get(`${this.baseUrlgetapprove}`+`/viewResponses/${user_id}`);
  }

  private baseUrlgetmentor='http://localhost:8089/api/getSkillsByName';
  getMentorBySkill(skill_name: String): Observable<any> {
    return this.http.get(`${this.baseUrlgetmentor}/${skill_name}`);
  }
  private baseUrlallmentor='http://localhost:8089/api/admin/mentor/getDetails';
  getAllMentor(): Observable<any> {
    return this.http.get(`${this.baseUrlallmentor}`);
  }
  private baseUrlUser = 'http://localhost:8089/api/user';
  getuserCompletedTrainings(user_id: number): Observable<any> {
    return this.http.get(`${this.baseUrlUser}`+ `/getallCompleted/${user_id}`);
  }
  private baseUrlAdminUser='http://localhost:8089/api/admin/user/getDetails';
  getAllUser(): Observable<any> {
    return this.http.get<any>(`${this.baseUrlAdminUser}`);
  }
  registerUser(user: Object): Observable<any> {
    return this.http.post(`${this.baseUrlUser}`+`/detail/create`,user);
  }
  registerMentor(mentor: Object): Observable<any> {
    return this.http.post(`${this.baseUrl}`+`/detail/create`,mentor);
  }

}