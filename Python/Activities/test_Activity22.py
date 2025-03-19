import pytest

def testSum():
    assert (7+5) == 12

def testMinus():
    assert (7-5) == 2

@pytest.mark.activity
def testMultiply():
    assert (7*5) == 35

@pytest.mark.activity
def testDivide():
    assert (25/5) == 5
