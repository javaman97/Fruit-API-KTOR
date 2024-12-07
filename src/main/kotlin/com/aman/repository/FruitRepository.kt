package com.aman.repository

import com.aman.model.Fruit
import com.aman.model.Type

object FruitRepository {

    private val fruits = mutableListOf(
    Fruit(name = "Apple", season = "Autumn", type = Type.Fruit, image = "https://images.unsplash.com/photo-1567306226416-28f0efdc88ce"),
    Fruit(name = "Mango", season = "Summer", type = Type.Fruit, image = "https://images.unsplash.com/photo-1610564553836-df25b3a42b4d"),
    Fruit(name = "Banana", season = "All year", type = Type.Fruit, image = "https://images.unsplash.com/photo-1574226516831-e1dff420486d"),
    Fruit(name = "Orange", season = "Winter", type = Type.Citrus, image = "https://images.unsplash.com/photo-1580587771525-78b9dba3b914"),
    Fruit(name = "Grapes", season = "Summer", type = Type.Berry, image = "https://images.unsplash.com/photo-1574225070611-94b9dc435ecc"),
    Fruit(name = "Watermelon", season = "Summer", type = Type.Melon, image = "https://images.unsplash.com/photo-1612902213534-36e4ee13a89c"),
    Fruit(name = "Pineapple", season = "Spring", type = Type.Tropical, image = "https://images.unsplash.com/photo-1551622811-02949d9e5ec0"),
    Fruit(name = "Strawberry", season = "Spring", type = Type.Berry, image = "https://images.unsplash.com/photo-1585675100414-7f6d93c18b58"),
    Fruit(name = "Blueberry", season = "Summer", type = Type.Berry, image = "https://images.unsplash.com/photo-1506806732259-39c2d0268443"),
    Fruit(name = "Kiwi", season = "Winter", type = Type.Fruit, image = "https://images.unsplash.com/photo-1571715674551-85f7e6fb3701"),
    Fruit(name = "Peach", season = "Summer", type = Type.Stonefruit, image = "https://images.unsplash.com/photo-1582309305553-f4824a2883fd"),
    Fruit(name = "Cherry", season = "Summer", type = Type.Stonefruit, image = "https://images.unsplash.com/photo-1502741126161-b048400d8aab"),
    Fruit(name = "Papaya", season = "All year", type = Type.Tropical, image = "https://images.unsplash.com/photo-1592147242045-41c63862cd7e"),
    Fruit(name = "Guava", season = "Winter", type = Type.Tropical, image = "https://images.unsplash.com/photo-1598032891311-7cc0d1f8fb1a"),
    Fruit(name = "Pomegranate", season = "Fall", type = Type.Fruit, image = "https://images.unsplash.com/photo-1519985176271-adb1088fa94c"),
    Fruit(name = "Dragon Fruit", season = "Summer", type = Type.Tropical, image = "https://images.unsplash.com/photo-1605032656213-2230bcb9f286"),
    Fruit(name = "Cantaloupe", season = "Summer", type = Type.Melon, image = "https://images.unsplash.com/photo-1567303150732-32b979e49495"),
    Fruit(name = "Pear", season = "Autumn", type = Type.Fruit, image = "https://images.unsplash.com/photo-1570057634754-950ed8ff605b"),
    Fruit(name = "Fig", season = "Summer", type = Type.Fruit, image = "https://images.unsplash.com/photo-1581848841954-5b8c8d038004"),
    Fruit(name = "Plum", season = "Summer", type = Type.Stonefruit, image = "https://images.unsplash.com/photo-1619362487122-1b8cd7ad352e"),
    Fruit(name = "Apricot", season = "Summer", type = Type.Stonefruit, image = "https://images.unsplash.com/photo-1572608969755-78b5b6f58a32"),
    Fruit(name = "Lemon", season = "Winter", type = Type.Citrus, image = "https://images.unsplash.com/photo-1569025798-9a6e8d742ab9"),
    Fruit(name = "Coconut", season = "All year", type = Type.Tropical, image = "https://images.unsplash.com/photo-1570530321462-540423d9572d"),
    Fruit(name = "Blackberry", season = "Summer", type = Type.Berry, image = "https://images.unsplash.com/photo-1599834982019-7a46b7e4a684"),
    Fruit(name = "Raspberry", season = "Summer", type = Type.Berry, image = "https://images.unsplash.com/photo-1574242319872-b6ec11b9e560"),
    Fruit(name = "Tangerine", season = "Winter", type = Type.Citrus, image = "https://images.unsplash.com/photo-1586359313479-cc587b779179"),
    Fruit(name = "Jackfruit", season = "Summer", type = Type.Tropical, image = "https://images.unsplash.com/photo-1605321490561-d08c63d8d1fe"),
    Fruit(name = "Lime", season = "All year", type = Type.Citrus, image = "https://images.unsplash.com/photo-1562199321-6f9b0a9f8e51"),
    Fruit(name = "Mulberry", season = "Summer", type = Type.Berry, image = "https://images.unsplash.com/photo-1593787042991-155207229e25")


    )

    fun allFruits():List<Fruit> = fruits

    fun fruitsByType(type:Type) = fruits.filter {
        it.type == type
    }

    fun fruitsByName(name:String) = fruits.find {
        it.name.equals(name, ignoreCase = true)
    }

    fun fruitsBySeason(season: String) = fruits.find {
        it.season.equals(season, ignoreCase = true)
    }
}