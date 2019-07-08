import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-item-view',
  templateUrl: './item-view.component.html',
  styleUrls: ['./item-view.component.css']
})
export class ItemViewComponent implements OnInit {

  item;

  constructor(private route: ActivatedRoute) { }

  ngOnInit() {
    // this.route.params.subscribe((e: any) => {
    //   this.itemService.loadItem(e.itemId)
    //     .subscribe(e => {
    //       this.item = e;
    //     })
    // })
    this.route.data.subscribe(e => {
      this.item = e.item;
    })
  }

}
