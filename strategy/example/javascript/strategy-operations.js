/* 
 * Defining the Strategy interface
 */
var Strategy = function() {
};
//execute method need to be overriden in the inherited object chain
Strategy.prototype.execute = function(a, b) {
    throw new Error('Strategy#execute must be overrridden.');
};

//Defining addition operation
var AdditionStrategy = function() {
};
//Linking prototype chain
AdditionStrategy.prototype = Object.create(Strategy.prototype);
AdditionStrategy.prototype.execute = function(a, b) {
    console.log('addition result:', a + b);
};

//Defining subtraction operation(Strategy)
var SubtractionStrategy = function() {
};
//Linking prototype chain
SubtractionStrategy.prototype = Object.create(Strategy.prototype);
SubtractionStrategy.prototype.execute = function(a, b) {
    console.log('Difference result:', a - b);
};

//Defining multiplication operation(Strategy)
var MultiplicationStrategy = function() {
};
//Linking prototype chain
MultiplicationStrategy.prototype = Object.create(Strategy.prototype);
MultiplicationStrategy.prototype.execute = function(a, b) {
    console.log('multiplication result:', a * b);
};

//Defining division operation(Strategy)
var DivisionStrategy = function() {
};
//Linking prototype chain
DivisionStrategy.prototype = Object.create(Strategy.prototype);
DivisionStrategy.prototype.execute = function(a, b) {
    console.log('Division result:', a / b);
};

/**
 * Defining context class
 * @param {type} strategy --strategy passed as parameter
 * @returns {Context}
 */
var Context = function(strategy) {
    this.strategy = strategy;
};
//evaluating result
Context.prototype.result = function(a,b) {
  return this.strategy.execute(a,b);
};
 
//creating various instances and using the result

var additionContext=new Context(new AdditionStrategy());
additionContext.result(5,4);

var subtractionContext=new Context(new SubtractionStrategy());
subtractionContext.result(5,4);

var multiplicationContext=new Context(new MultiplicationStrategy());
multiplicationContext.result(5,4);

var divisionContext=new Context(new DivisionStrategy());
divisionContext.result(5,4);
