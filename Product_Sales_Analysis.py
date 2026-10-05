import pandas as pd

data = {
    "Product Name": ["Laptop", "Wireless Mouse", "Mechanical Keyboard", "Monitor", "Office Chair"],
    "Category": ["Electronics", "Electronics", "Electronics", "Electronics", "Furniture"],
    "Price": [1200.0, 25.0, 75.0, 300.0, 150.0],    
    "Quantity Sold": [40, 120, 85, 30, 60]
}

datas = pd.DataFrame(data)
print(datas)

print("\nTotal sales amount for each product: ")

datas["Total Sales"] = datas["Price"] * datas["Quantity Sold"]
print(datas[["Product Name","Total Sales"]])

print("\n The Highest Sales are :")
Maximum = datas[["Product Name","Quantity Sold"]].max()
print(Maximum)

print("\nThe Average product price: ")
average = datas["Price"].mean()
print(average)

print("\n The Product that Higher than 50: ")
higher = datas["Quantity Sold"] > 50
print(datas[higher])

print("\nProduct sort based on Sales: ")
print(datas.sort_values("Quantity Sold"))