
//------------------------------------------
// Model
//------------------------------------------

class Todo {
    constructor(title, date) {
        Todo.nextId++;
        this.id = Todo.nextId; // auto_increment
        this.title = title;
        this.completed = false
        this.date = date
    }
}
Todo.nextId = 0;

//------------------------------------------
// Service
//------------------------------------------

class TodosService {
    constructor() {
        this.todos = []
    }
    addTodo(title) {
        let newTodo = new Todo(title)
        this.todos = this.todos.concat(newTodo)
    }
    editTodo(id, newTitle) {
        this.todos = this.todos.map(todo => todo.id === id ? Object.assign({}, todo, { title: newTitle }) : todo)
    }
    completeTodo(id) {
        this.todos = this.todos.map(todo => todo.id === id ? Object.assign({}, todo, { completed: !todo.completed }) : todo)
    }
    completeAll() {
        let isAllCompleted = this.todos.every(todo => todo.completed)
        this.todos = this.todos.map(todo => todo.id === id ? Object.assign({}, todo, { completed: !isAllCompleted }) : todo)
    }
    deleteTodo(id) {
        this.todos = this.todos.filter(todo => todo.id !== id)
    }
    clearCompleted() {
        this.todos = this.todos.filter(todo => !todo.completed)
    }
    viewTodos(filter) {
        this.todos.forEach(todo => console.log(todo))
    }
}

//------------------------------------------

const service = new TodosService();


service.addTodo('Learn Javascript ')
service.addTodo('Learn Java')
service.addTodo('Learn Life ')

//------------------------------------------