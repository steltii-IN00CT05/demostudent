let list = document.querySelector("ul")

// Getting a list of courses when opening the webpage
getCourses()

// Form button
document.querySelector("button")
.addEventListener("click", e =>{
    e.preventDefault()

    // Creating course object from form data
    let course = {
        teacher: document.getElementById("tcr"),
        courseName: document.getElementById("cName")
    }

    fetch("https://localhost:8080/addcourse",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },
          method: "POST",
          body: JSON.stringify(course)
      })
      .then(resp => getCourses())  
})

//Function for getting all the courses
function getCourses()
{
    //Empty the list in webpage
    list.innerHTML = ""

    //Fetch all the blogs from the server
    fetch("http://localhost:8080/courses")
    .then(response => response.json())
    .then( data =>
    {
        //Create list item of each blog object
        data.forEach(i => {
            let li = document.createElement("li")
            li.innerText = i.message
            list.appendChild(li)
        })
    })
}