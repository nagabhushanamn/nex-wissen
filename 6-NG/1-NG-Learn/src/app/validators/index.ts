
import { AbstractControl } from '@angular/forms'

export function ssn(c: AbstractControl): { [key: string]: any } | null {
    let value = c.value;
    let pattern = /\d{3}-\d{2}-\d{4}/
    if (pattern.test(value)) return null
    else return { ssn: 'invalid SSN' }
}