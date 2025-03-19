# import pandas
import pandas

# Structure our data as a dictionary
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}
    
print(data)

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)
print(dataframe)

# Write the data to a csv file
dataframe.to_csv("login_credientials.csv", index=False)

#read csv file
dataframe = pandas.read_csv('login_credientials.csv')

# Print the DataFrame
print(dataframe)