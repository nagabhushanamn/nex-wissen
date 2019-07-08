import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ItemService } from '../item.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-item-form',
  templateUrl: './item-form.component.html',
  styleUrls: ['./item-form.component.css']
})
export class ItemFormComponent implements OnInit {

  itemForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private itemService: ItemService,
    private router: Router,
    private route: ActivatedRoute) { }

  ngOnInit() {

    this.route.params.subscribe((e: any) => {
      this.itemService.loadItem(e.itemId)
        .subscribe(e => {
          this.itemForm.patchValue(e)
        })
    })

    this.itemForm = this.fb.group({
      id: [''],
      name: [''],
      price: [0.0],
      description: ['']
    })
  }

  handleSubmit() {
    this.itemService.saveItem(this.itemForm.value)
      .subscribe(e => {
        this.router.navigate(['all'])
      })
  }

}
