import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';
import { ChangeRequest } from './ChangeRequest';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [AppService]
})
export class AppComponent implements OnInit {
  symbols: string[];
  change: ChangeRequest = {
    to:'',
    from:'',
    amount:0
  };
  from: string;
  to: string;
  
  constructor(private appService: AppService){}

  ngOnInit(): void {
    this.appService.getSymbols().subscribe(symbols => this.symbols=symbols);
  }

  calculate():void{
    this.from=this.change.amount + " " + this.change.from;
    this.appService.calculate(this.change).subscribe(amount => this.to = amount+ " " + this.change.to);
  }
}
