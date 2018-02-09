def Main():
    sales = input('How many sales were produced this month?')
    county = countyTax(sales)
    state = stateTax(sales)
    total = totalTax(sales)
    totalSales(sales, county, state, total)
    
def countyTax(sales):
    county = sales * .02
    return county

def stateTax(sales):
    state = sales * .04
    return state

def totalTax(sales):
    totalTax = sales * .06
    return totalTax

def totalSales(sales, county, state, total):
    print 'The total sales for this month are: $', sales
    print 'The county taxes for this month are: $', county
    print 'The state taxes for the month are: $', state
    print 'The total taxes that are paid this month are: $', total


Main()
