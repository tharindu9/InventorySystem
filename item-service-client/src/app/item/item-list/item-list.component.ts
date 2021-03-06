import { Component, OnInit } from '@angular/core';
import {ItemService} from '../../service/item.service';
import { Observable } from "rxjs";
import{Item} from '../../models/item'

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  items : Observable<Item[]>;
  constructor(private itemService : ItemService) { }

  ngOnInit() {

    this.displayeItems();
  }

  displayeItems(){
    this.items = this.itemService.getAllItems();
    this.items.forEach(ele=>{
      console.log(ele);
    })
  }

  onDelete(id){
    this.itemService.deletItem(id).subscribe(data=>{
      console.log(data);
    });
  }

}
