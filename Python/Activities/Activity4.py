userInput = 'yes'

while  userInput == 'yes':
    player1 = input("Palyer1 Please Enter Rock-Paper-Scissors: ").lower()
    player2 = input("Palyer2 Please Enter Rock-Paper-Scissors: ").lower()

    print("Player1 has entered - " + player1)
    print("Player2 has entered - " + player2)

    if player1 == player2:
        print("It's a tie..!! Both players enter the same input " + player1)
    elif player1 == "rock":
        if player2 == "scissors":
            print("Rock wins")
        elif player2 == "paper":
            print("Paper wins")
        else:
            print("Invalid input! Player2 have not entered rock, paper or scissors, try again.")
    elif player1 == "scissors":
        if player2 == "paper":
            print("Scissors wins")
        elif player2 == "rock":
            print("Rock wins")
        else:
            print("Invalid input! Player2 have not entered rock, paper or scissors, try again.")
    elif player1 == "paper":
        if player2 == "rock":
            print("Paper wins")
        elif player2 == "scissors":
            print("Scissors wins")
        else:
            print("Invalid input! Player2 have not entered rock, paper or scissors, try again.")
    else:
        print("Invalid input! Player1 have not entered rock, paper or scissors, try again.")

    userInput = input("want to play another round (yes/no): ").lower()
    if userInput == 'yes':
        print("The game begin again")
    else:
        print("Thank you for paying. The game ends..!!!")
        break;
        
