

//   ---------------------------------------------------
//   way-1: using w3c's web component spec based APIs
//   ---------------------------------------------------


// Template 
const template = document.createElement('template');
template.innerHTML = `
    <style>
    .alert{
        padding:20px;
        margin:5px;
    }
    .alert-info{
        background-color:#DEF;
    }
    </style>
    <div class="alert alert-info">
        <button class="btn btn-success">+</button>
        <span class="badge badge-dark">0</span>
        <button class="btn btn-danger">-</button>
    </div>
`


// Web compoennnt
class XCounter extends HTMLElement {

    static get observedAttributes() {
        return ['value']
    }

    constructor() {
        super()

        this._value = 0;

        this.root = this.attachShadow({ mode: 'closed' })

        this.root.appendChild(template.content.cloneNode(true))

        this.valueElement = this.root.querySelector('span');
        this.incrementBtn = this.root.querySelectorAll('button')[0];
        this.decrementBtn = this.root.querySelectorAll('button')[1];

        this.incrementBtn.addEventListener('click', e => {
            this._value++
            this.value = this._value;
        })
        this.decrementBtn.addEventListener('click', e => {
            this._value--
            this.value = this._value;
        })
    }

    set value(value) {
        this.valueElement.innerText = value;
        this.dispatchEvent(new CustomEvent('valueChange', { detail: this._value }))
    }

    attributeChangedCallback(attrName, oldValue, newValue) {
        if (attrName === 'value') {
            this._value = Number.parseInt(newValue, 10)
            this.valueElement.innerText = this._value;
        }
    }

}

customElements.define('nex-counter', XCounter)


document.getElementsByTagName('nex-counter')[0]
    .addEventListener('valueChange', e => {
        console.log(e)
    })

document.getElementsByTagName('nex-counter')[1]
    .addEventListener('valueChange', e => {
        console.log(e)
    })

//----------------------------------------------------

let inp = document.getElementById('inp');
let applnState = {
    count: 0
}
setInterval(() => {
    applnState.count++
    inp.value = applnState.count
    inp.dispatchEvent(new Event('change'))
}, 3000)

function changeHandler() {
    // console.log("handling change event in input element");
    document.querySelector('.badge').innerHTML = applnState.count * 10
}
//----------------------------------------------------
