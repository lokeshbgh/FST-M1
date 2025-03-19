# import pandas
import pandas

#read the excel file data in dataframe
dataframe = pandas.read_excel("employee_detail.xlsx", sheet_name="Sheet1")

print("read data the Excel file : ")
print(dataframe)

print("number of rows and columns : ")
print(dataframe.shape)

print("data in the emails column only : ")
print(dataframe["Email"])

print("Sort the data based on FirstName in ascending order : ")
print(dataframe.sort_values("FirstName"))