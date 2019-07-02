



import { Observable, pipe, range } from 'rxjs'
import { map, flatMap, switchMap, mergeMap } from 'rxjs/operators'



const stream = Observable.create(observer => {
    let i = 0;
    setInterval(() => {
        i++;
        observer.next(i)
    }, 1000)
});



stream
    //.pipe(map(n=>n*n))
    .pipe(flatMap(n => range(0, n)))
    .subscribe(n => console.log(n))
