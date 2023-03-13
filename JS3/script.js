// 1. Напишите функцию, которая принимает два числовых аргумента и возвращает наименьшее из них.

function fun(a,b) {
    let c = Math.min(a,b)
    return c
}
console.log(fun(10,5))

/* 2. Напишите функцию, которая принимает два числовых аргумента и выводит в консоль все четные
 числа от большего к меньшему.*/
 function fun2(a1,b1) {
    let min = Math.min(a1,b1)
    let max = Math.max(a1,b1)
    for(let i = max;i >= min;i--){
        if(i%2==0){
            console.log(i)
        }
    }
 }
 fun2(17,9)
/* 3. Напишите функцию power, которая принимает два числовых аргумента 
(основание степени и саму степень) и возвращает число в указанной степени. 
Значение степени должно быть указано по умолчанию 2.*/
//const pow = 2
function power(num,pow = 2){
    return num**pow
}
console.log(power(3))
// 4. Напишите функцию, которая принимает числовой аргумент n и считает сумму чисел от 1 до n.

function fun3(n) {
    let sum = 0
    for(let i=1;i<=n;i++){
        sum += i
    }  
    return sum      
}
console.log(fun3(15))
/* 5. Напишите функцию, которая принимает два числовых аргумента n и m и считает сумму
четных чисел и нечетных чисел от n до m. Суммы выведите в консоль 
(в начале сумму четных чисел, а затем сумму нечетных).*/
let sumEven = 0
let sumOdd = 0
function fun4(n1,m1) {
    
    let min1 = Math.min(n1,m1)
    let max1 = Math.max(n1,m1)
    for(let i=min1;i<=max1;i++) {
        if(i%2==0){
            sumEven +=i
        } else{
            sumOdd +=i
        }
    } 
}
fun4(2,11)
console.log(sumEven)
console.log(sumOdd)
/* 6. Напишите функцию, которая принимает в качестве аргументов массив строк, а возвращает 
первый самый длинный элемент массива. Если входной массив пуст, функция возвращает null. 
Если есть несколько одинаковых по длине элементов - функция возвращает первый из этих элементов.
Пример: [ 'one', 'two', 'three' ] => 'three'*/
let arr = ['one', 'two', 'three']
function fun5(arr) {
    if(arr.length==0){
        return null
    } 
    let maxElement = arr[0]

    for(let i=1;i<arr.length;i++){
         if(arr[i].length>maxElement.length) {
            maxElement = arr[i]
        } 
    }
    return maxElement
    } 

console.log(fun5(arr))