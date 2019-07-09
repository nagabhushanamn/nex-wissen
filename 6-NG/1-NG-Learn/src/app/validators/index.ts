
import { AbstractControl, FormGroup } from '@angular/forms'

export function ssn(c: AbstractControl): { [key: string]: any } | null {
    let value = c.value;
    let pattern = /\d{3}-\d{2}-\d{4}/
    if (pattern.test(value)) return null
    else return { ssn: 'invalid SSN' }
}


export function dateRangeValidator(dateGroup: FormGroup) {
    let fromDate = dateGroup.get('fromDate').value;
    let toDate = dateGroup.get('toDate').value;
    if (fromDate === toDate) return null;
    else return { range: 'invalid dates' }
}