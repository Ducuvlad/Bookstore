import { Injectable } from '@angular/core';

import {HttpClient} from "@angular/common/http";

import {Client} from "./client.model";

import {Observable} from "rxjs";
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import {PurchaseService} from "../../purchases/shared/purchase.service";
import {p} from "@angular/core/src/render3";
import {Purchase} from "../../purchases/shared/purchase.model";


@Injectable()
export class ClientService {
  private clientsUrl = 'http://localhost:8080/api/clients';

  constructor(private httpClient: HttpClient,private purchaseService: PurchaseService) {
  }

  getClients(): Observable<Client[]> {
    return this.httpClient
      .get<Array<Client>>(this.clientsUrl);
  }

  getClient(id: number): Observable<Client> {
    return this.getClients()
      .map(clients => clients.find(client => client.id === id));
  }

  update(client): Observable<Client> {
    const url = `${this.clientsUrl}/${client.id}`;
    return this.httpClient
      .put<Client>(url, client);
  }

  save(name: string): Observable<Client> {
    let client = {name};
    return this.httpClient
      .post<Client>(this.clientsUrl, client);
  }

  delete(client): Observable<{}> {
    const url = `${this.clientsUrl}/${client.id}`;

    //this.purchaseService.getPurchases().map(purchases=>purchases
      //.find(purchase=>purchase.client.id==client.id))
      //.forEach(pur=>this.purchaseService.delete(pur));
    //this.purchaseService.getPurchases().forEach(p=>p
      //.forEach(n=>{if (n.client==client) this.purchaseService.delete(n)}));
    return this.httpClient
      .delete(url, client.id);
  }

}
