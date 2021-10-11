package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val superheroList = listOf<Superhero>(
            Superhero(R.drawable.antman,
                nameSuperhero = "Antmant",
                descSuperhero = "Ant-Man is the name of several superheroes appearing in books published by Marvel Comics. Created by Stan Lee, Larry Lieber and Jack Kirby, Ant-Man's first appearance was in Tales to Astonish #35 (September 1962). The persona was originally the brilliant scientist Hank Pym's superhero alias after inventing a substance that can change size, but reformed thieves Scott Lang and Eric O'Grady also took on the mantle after the original changed his superhero identity to various other aliases, such as Giant-Man, Goliath, and Yellowjacket. Pym's Ant-Man is also a founding member of the super hero team known as the Avengers. The character has appeared in several films based on the Marvel character, such as Ant-Man (2015), Captain America: Civil War (2016), Ant-Man and the Wasp (2018), and Avengers: Endgame (2019)."
            ),

            Superhero(R.drawable.captainmarvel,
                nameSuperhero = "Captain Marvel",
                descSuperhero = "Captain Marvel is a 2019 American superhero film based on Marvel Comics featuring the character Carol Danvers / Captain Marvel. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 21st film in the Marvel Cinematic Universe (MCU). The film was written and directed by Anna Boden and Ryan Fleck, with Geneva Robertson-Dworet also contributing to the screenplay. Brie Larson stars as Carol Danvers, alongside Samuel L. Jackson, Ben Mendelsohn, Djimon Hounsou, Lee Pace, Lashana Lynch, Gemma Chan, Annette Bening, Clark Gregg, and Jude Law. Set in 1995, the story follows Danvers as she becomes Captain Marvel after Earth is caught in the center of a galactic conflict between two alien civilizations."
            ),

            Superhero(R.drawable.doctor,
                nameSuperhero = "Doctor",
                descSuperhero = "Doctor Stephen Strange is a fictional character appearing in American comic books published by Marvel Comics. Created by Stan Lee and Steve Ditko,[5] the character first appeared in Strange Tales #110 (cover-dated July 1963). Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats. Inspired by stories of black magic and based on Chandu the Magician by Harry A. Earnshaw and Raymond R. Morgan, Strange was created during the Silver Age of Comic Books to bring a different kind of character and themes of mysticism to Marvel Comics."
            ),

            Superhero(R.drawable.gamora,
                nameSuperhero = "Gamora",
                descSuperhero = "Gamora is a fictional character appearing in American comic books published by Marvel Comics. Created by writer/artist Jim Starlin, the character first appeared in Strange Tales #180 (June 1975). Gamora is the adopted daughter of Thanos, and the last of her species. Her powers include superhuman strength and agility and an accelerated healing factor. She also is an elite combatant, being able to beat most of the opponents in the galaxy. She is a member of the superhero group known as the Infinity Watch. The character played a role in the 2007 crossover comic book event \"Annihilation: Conquest\", becoming a member of the titular team in its spin-off comic, Guardians of the Galaxy, before becoming the supervillain Requiem in the 2018 crossover comic book events \"Infinity Countdown\" and \"Wars\"."
            ),

            Superhero(R.drawable.hawkeye,
                nameSuperhero = "Hawkeye",
                descSuperhero = "Hawkeye is an upcoming American television miniseries created by Jonathan Igla for the streaming service Disney+, based on Marvel Comics featuring the characters Clint Barton / Hawkeye and Kate Bishop / Hawkeye. It is intended to be the fifth television series in the Marvel Cinematic Universe (MCU) produced by Marvel Studios, sharing continuity with the films of the franchise and taking place after the events of the film Avengers: Endgame (2019). Igla serves as head writer with Rhys Thomas leading the directing team."
            ),

            Superhero(R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "The Hulk is a fictional character and superhero appearing in publications by the American publisher Marvel Comics. Created by writer Stan Lee and artist Jack Kirby, the character first appeared in the debut issue of The Incredible Hulk (May 1962). In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a vast degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist. The two exist as independent dissociative personalities, and resent each other."),

            Superhero(R.drawable.ironman,
                nameSuperhero = "Ironman",
                descSuperhero = "Iron Man is a superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963), and received his own title in Iron Man #1 (May 1968). Also in 1963, the character founded the Avengers alongside Thor, Ant-Man, Wasp and the Hulk."
            ),

            Superhero(R.drawable.loki,
                nameSuperhero = "Loki",
                descSuperhero = "Loki is an American television series created by Michael Waldron for the streaming service Disney+, based on Marvel Comics featuring the character of the same name. It is the third television series in the Marvel Cinematic Universe (MCU) produced by Marvel Studios, sharing continuity with the films of the franchise. The series takes place after the events of the film Avengers: Endgame (2019), in which an alternate version of Loki created a new timeline. Waldron serves as head writer, with Kate Herron directing for the first season."
            ),

            Superhero(R.drawable.nebula,
                nameSuperhero = "Nebula",
                descSuperhero = "A nebula (Latin for 'cloud' or 'fog';[2] pl. nebulae, nebulæ or nebulas[3][4][5][6]) is a distinct body of interstellar clouds (which can consist of cosmic dust, hydrogen, helium, molecular clouds; possibly as ionized gases). Originally, the term was used to describe any diffused astronomical object, including galaxies beyond the Milky Way. The Andromeda Galaxy, for instance, was once referred to as the Andromeda Nebula (and spiral galaxies in general as \"spiral nebulae\") before the true nature of galaxies was confirmed in the early 20th century by Vesto Slipher, Edwin Hubble and others. Edwin Hubble discovered that most nebulae are associated with stars and illuminated by starlight. He also helped categorize nebulae based on the type of light spectra they produced"
            ),

            Superhero(R.drawable.panther,
                nameSuperhero = "Panther",
                descSuperhero = "Black Panther is a fictional character and superhero appearing in American comic books published by Marvel Comics. The character was created by writer-editor Stan Lee and writer-artist Jack Kirby, first appearing in Fantastic Four #52 (cover-dated July 1966) in the Silver Age of Comic Books. Black Panther's real name is T'Challa, and he is depicted as the king and protector of the fictional African nation of Wakanda. Along with possessing enhanced abilities achieved through ancient Wakandan rituals of drinking the essence of the heart-shaped herb, T'Challa also relies on his proficiency in science, rigorous physical training, hand-to-hand combat skills, and access to wealth and advanced Wakandan technology to combat his enemies."
            ),

            Superhero(R.drawable.spiderman,
                nameSuperhero = "Spiderman",
                descSuperhero = "Spider-Man is a superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 (Aug. 1962) in the Silver Age of Comic Books. He appears in American comic books published by Marvel Comics and in movies, television shows, and video game adaptations set in the Marvel Universe. Spider-Man is the alias of Peter Parker, an orphan raised by his Aunt May and Uncle Ben in New York City after his parents Richard and Mary Parker died in a plane crash. Lee and Ditko had the character deal with the struggles of adolescence and financial issues and gave him many supporting characters, such as J. Jonah Jameson, Harry Osborn, romantic interests Gwen Stacy and Mary Jane Watson, and foes such as Doctor Octopus, the Green Goblin, Venom, and Mephisto. In his origin story, he gets spider-related abilities from a bite from a radioactive spider; these include clinging to surfaces, superhuman strength and agility, and detecting danger with his spider-sense.He also builds wrist-mounted web-shooter devices that shoot artificial spider-webbing of his own design"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}