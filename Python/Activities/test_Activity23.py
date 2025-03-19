import pytest

'''
# Create fixture
@pytest.fixture
def number_list():

    # Create list
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    return list
'''

# Write test method
def test_list_Addition(number_list):

    # Initialize sum
    sum = 0

    # Add number in the list
    for n in number_list:
        sum += n

    # Assertion
    assert sum == 55