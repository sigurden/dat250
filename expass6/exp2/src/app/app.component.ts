import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormControl } from '@angular/forms';

export interface Todo {
  description: string;
  id: number;
  summary: number;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'todo-app';
  displayedColumns: string[] = ['id', 'summary', 'description', 'delete'];
  dataSource: any = [];
  description = new FormControl('');
  summary = new FormControl('');

  constructor(private http: HttpClient) {

  }

  ngOnInit(): void {
	  this.getAndUpdateTodos();
  }
  deleteElement(element: Todo ): void {
	  this.http.delete(`http://localhost:8080/todos/${element.id}`)
	  .subscribe(Response => {
		  console.log({Response});
		  this.getAndUpdateTodos();
	  });
  }
  getAndUpdateTodos(): void {
	  this.http.get('http://localhost:8080/todos')
	  .subscribe(Response => {
		  console.log({Response});
		  this.dataSource = Response;

	  });
  }
  addTodo(): void{
	  console.log({summary: this.summary.value, description: this.description.value});
	  this.http.post('http://localhost:8080/todos', {summary: this.summary.value, description: this.description.value})
	  .subscribe(Response => {
		  console.log({Response});
		  this.getAndUpdateTodos();
	  });
  }
}
