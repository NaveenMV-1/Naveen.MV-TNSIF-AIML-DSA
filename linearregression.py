#Linear Regression

from sklearn.linear_model import LinearRegression

import numpy as np

x = np.array([[1],[2],[3],[4],[5]])

y = np.array([20,30,40,50,60])

model = LinearRegression()

model.fit(x, y)

prediction = model.predict([[8]])

print(prediction)

#y = mx + c


