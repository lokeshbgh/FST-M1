fruit_shop =	{
  "apple": 100,
  "banana": 25,
  "orange": 50,
  "watermelon": 20
}

user = input("you are looking for Which fruit : ").lower()
flag = ''
for x in fruit_shop:
    if x.lower() == user :
        flag = 'true'
        break
    else:
        flag='false'

if flag == 'true':
    print(user + " fruit is available")
else:
    print(user + " fruit is not available")


if user in fruit_shop:
    print("Yes, this is available")
else:
    print("No, this is not available")