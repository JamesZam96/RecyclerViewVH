package com.example.superhero.data

import com.example.superhero.model.Superhero

class DataSource {
    fun getSuperhero():MutableList<Superhero>{
        var superheros:MutableList<Superhero> = mutableListOf()
        superheros.add(Superhero("Spiderman","Marvel","Peter Parker","https://static.wikia.nocookie.net/ficcion-sin-limites/images/6/6b/Spidey.png/revision/latest/scale-to-width-down/375?cb=20210226124716&path-prefix=es"))
        superheros.add(Superhero("Daredevil","Marvel","Matthew","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFz3YORhqxgzJbVAo9r1n9A5Q9GoFVZYYSTaob8pjtrQ&s"))
        superheros.add(Superhero("Wolverine","Marvel","James","https://img.redbull.com/images/c_crop,x_363,y_0,h_407,w_325/c_fill,w_450,h_600/q_auto:low,f_auto/redbullcom/2019/02/11/87f8642d-126d-4219-acc9-12ca261bfe39/wolverine"))
        superheros.add(Superhero("Thor","Marvel","Thor Odinson","https://www.mundodeportivo.com/alfabeta/hero/2023/11/template-54_3j4t.1700561720.8893.jpg?width=768&aspect_ratio=16:9&format=nowebp"))
        superheros.add(Superhero("Flash","DC","Jay Garrick","https://static.wikia.nocookie.net/batman/images/6/6c/The_Flash.jpg/revision/latest?cb=20170402141709&path-prefix=es"))
        return superheros
    }
}