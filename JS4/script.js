//1
const numbers = document.querySelector('.numbers')
for(let i = 100;i>=50;i-=10) {
    numbers.innerHTML +=`<p>${i}</p>`
}
//2
const strContainer = document.querySelector('.strings_container')
const str = ["one", "two", "three", "four"]
for (let i = 0; i < str.length; i++) {
    strContainer.innerHTML += `<p>${str[i]}</p>`
}
//3
const users = [
    {
        first_name: "Dmitriy",
        last_name: "Tokarev",
        age: 34
    },
    {
        first_name: "Maryna",
        last_name: "Tokareva",
        age: 28
    },
    {
        first_name: "Yeva",
        last_name: "Tokareva",
        age: 5
    }
]
const usersContainer = document.querySelector('.users_container')
for(let i=0;i<users.length;i++) {
    if(users[i].age >= 18){
        usersContainer.innerHTML += `
        <div class="user_card">
            <p>Имя ${users[i].first_name}</p>
            <p>Фамилия ${users[i].last_name}</p>
            <p>Врзраст ${users[i].age}</p>
        </div>
      `
    }
}