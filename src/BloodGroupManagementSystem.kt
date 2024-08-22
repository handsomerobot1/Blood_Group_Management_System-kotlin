class BloodGroupManagementSystem {
    private val donors = mutableListOf<Donor>()
    private val users = mutableListOf<User>()

    init {
        //Users
        users.add(User("admin", "123456"))
        users.add(User("musfiq", "123456"))
        users.add(User("sakib", "123456"))

        //Donors
        Donor("Alice Smith", "123 Elm St, Springfield", "A+", 1, 20230815)
        Donor("Bob Johnson", "456 Oak St, Springfield", "B-", 2, 20230720)
        Donor("Charlie Brown", "789 Pine St, Springfield", "O+", 3, 20230801)
        Donor("David Williams", "101 Maple St, Springfield", "AB-", 4, 20230810)
        Donor("Eva Davis", "202 Birch St, Springfield", "A-", 5, 20230805)
        Donor("Frank Miller", "303 Cedar St, Springfield", "B+", 6, 20230715)
        Donor("Grace Wilson", "404 Willow St, Springfield", "O-", 7, 20230812)
        Donor("Henry Moore", "505 Walnut St, Springfield", "AB+", 8, 20230803)
        Donor("Ivy Taylor", "606 Chestnut St, Springfield", "A+", 9, 20230725)
        Donor("Jack Anderson", "707 Fir St, Springfield", "B-", 10, 20230809)
        Donor("Kara Thomas", "808 Spruce St, Springfield", "O+", 11, 20230806)
        Donor("Liam Jackson", "909 Hemlock St, Springfield", "AB-", 12, 20230813)
        Donor("Mia White", "1010 Poplar St, Springfield", "A-", 13, 20230804)
        Donor("Noah Harris", "1111 Aspen St, Springfield", "B+", 14, 20230730)
        Donor("Olivia Martin", "1212 Willow St, Springfield", "O-", 15, 20230811)
        Donor("Paul Lee", "1313 Elm St, Springfield", "AB+", 16, 20230807)
        Donor("Quinn Clark", "1414 Oak St, Springfield", "A+", 17, 20230808)
        Donor("Rita Lewis", "1515 Pine St, Springfield", "B-", 18, 20230802)
        Donor("Sam Walker", "1616 Maple St, Springfield", "O+", 19, 20230728)
        Donor("Tina Hall", "1717 Birch St, Springfield", "AB-", 20, 20230814)
        Donor("Alice Smith", "123 Elm St, Springfield", "A+", 1, 20230815)

    }

    //login user
    fun login():Boolean{
        print("Enter Username: ")
        val userName = readLine()!!
        println()
        print("Enter Password: ")
        val password = readLine()!!
        println()

        return users.any{
            it.username == userName && it.password == password
        }

    }

    fun searchDonor(){
        print("Enter Donor Name OR Address OR Blood Group: ")
        val query = readLine()!!.trim().lowercase()
        println()

        val results = donors.filter {
            it.name.lowercase().contains(query) || it.address.lowercase().contains(query) || it.bloodGroup.lowercase().contains(query)
        }

        if(results.isEmpty()){
            println("No donor found")
        }else{
            println("Donor found")
            var i = 1
            results.forEach{
                println("Donor: ${i++}")
                println("Name: ${it.name}")
                println("Address: ${it.address}")
                println("Blood Group: ${it.bloodGroup}")
                println("id: ${it.id}")
                println("Blood Group: ${it.last_donate_date}")

                println()
            }
        }
    }
    fun searchDonor1(){
        print("Enter Donor Name OR Address OR Blood Group: ")
        val query = readLine()!!.trim().lowercase()
        println()

        val results = donors.filter {
            it.name.lowercase().contains(query) || it.address.lowercase().contains(query) || it.bloodGroup.lowercase().contains(query)
        }

        if(results.isEmpty()){
            println("No donor found")
        }else{
            println("Donor found")
            var i = 1
            results.forEach{
                println("Donor: ${i++}")
                println("Name: ${it.name}")
                println("Address: ${it.address}")
                println("Blood Group: ${it.bloodGroup}")
                println()
            }
        }
    }

    fun addDonor(){
        print("Enter Donor Name: ")
        val name = readLine()!!
        println()

        print("Enter Donor Address: ")
        val address = readLine()!!
        println()


        print("Enter Donor bloodGroup: ")
        val bloodGroup = readLine()!!
        println()

        println("Enter Donor id: ")
        val id = readLine()!!
        println()

        println("Enter Donor last_donate_date: ")
        val last_donate_date = readLine()!!
        println()


        donors.add(Donor(name, address, bloodGroup, id=0,last_donate_date=0))

        println("Donor Added Successfully")
    }


    fun mainMenu(){
        while (true){
            println("__________________Main Menu__________________")
            println("1.Search Donor")
            println("2.Add Donor")
            println("0.Exit")
            println("Enter your choice: ")
            when(readLine()){
                "1" -> searchDonor()
                "2" ->addDonor()
                "0" -> {
                    println("Exiting")
                    return
                }
                else -> {
                    println("Invalid choice. Please try again")
                }
            }
        }
    }

}