import {Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

import{ChangeRequest} from './ChangeRequest'

@Injectable()
export class AppService{
    getSymbolsUrl="http://localhost:8080/symbols"
    calculateUrl="http://localhost:8080/convert?"

    constructor(private http: HttpClient){}

    getSymbols(): Observable<string[]>{
        return this.http.get<string[]>(this.getSymbolsUrl);
    }

    calculate(change: ChangeRequest): Observable<number>{
        const link=this.calculateUrl + "from="+change.from + "&to=" + change.to + "&amoount=" + change.amount;
        console.log(link);
        return this.http.get<number>(link);
    }
}