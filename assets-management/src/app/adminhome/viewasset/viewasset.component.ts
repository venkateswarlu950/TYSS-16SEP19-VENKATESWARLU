import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-viewasset',
  templateUrl: './viewasset.component.html',
  styleUrls: ['./viewasset.component.css']
})
export class ViewassetComponent implements OnInit {

  asset:[];
  inputdata:String;

  constructor(private http:HttpClient,private router: Router) {
   
   }

  ngOnInit() {
  }

  search(event){
    this.inputdata = event.value;
    this.http.get<any>('https://localhost:8083/getassest?'+this.inputdata).subscribe(data=>{
   this.asset = data;
  },err=>{
    console.log(err);
  });
  }

  edit(){
    this.router.navigateByUrl('/updateasset');
  }
}
