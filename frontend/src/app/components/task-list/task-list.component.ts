import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
  tasks: any[]; // Replace with your task model

  constructor() { }

  ngOnInit(): void {
    // Retrieve tasks from your backend service
    this.tasks = [
      { title: 'Task 1' },
      { title: 'Task 2' },
      // Add more tasks
    ];
  }
}
