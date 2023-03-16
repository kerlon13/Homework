//1
const btn = document.querySelector('.btn')
btn.addEventListener('click', function() {
    const div = document.querySelector('.item')
    div.classList.toggle('green')
})
//2
const btn2 = document.querySelector('.btn-2')
btn2.addEventListener('click', function() {
    const div2 = document.querySelector('.pink')
    div2.style.backgroundColor = 'blue'
    console.log(div2.style.backgroundColor)
})
//3
const btn3 = document.querySelector('.btn-3')
btn3.addEventListener('click', function() {
    const div3 = document.querySelector('.item-3')
    div3.classList.toggle('change-size')
    
})
//4-5
const btn4 = document.querySelector('.btn-4')
btn4.addEventListener('click', function() {
    const divRoot = document.querySelector('.root')
    divRoot.innerHTML = `
    <p class="p-root-blue">Lorem</p>
    <p class="p-root-green">Lorem dsfdsfds</p>
    `
})

