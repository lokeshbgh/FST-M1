# Create fixture
import pytest

@pytest.fixture
def number_list():
    # Create list
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return list

@pytest.fixture
def wallet():
    # initializes the variable with 0
    amount = 0
    return amount