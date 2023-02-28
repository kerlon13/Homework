//1
const number1 = prompt('Введите число')
console.log(number1 * 10 / 100)
//2
const num1 = prompt('Введите число 1')
const num2 = prompt('Введите число 2')
if(num1 < num2) {
    console.log(num1)
} else {
    console.log(num2)
}
//3
const number2 = prompt('Введите число')
if(number2 > 100) {
    console.log("Число больше 100")
} else if(number2 == 100) {
    console.log("Число равно 100")
} else {
    console.log("Число меньше 100")
}
//4
const firstName = prompt('Введите ваше имя')
const age = prompt('Введите ваш возраст')
if(age >= 18) {
    console.log("Hello " + firstName)
} else {
    console.log("Hi " + firstName)
}
