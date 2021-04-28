function sum(a,b)
{
    alert(a+b)
}
sayHello = function(a)
{
    alert(a)
}
String.prototype.MyString = function () {
    return this
}


function User(no,name,loc) {
    this.no=no;
    this.name=name;
    this.loc=loc;
    this.GetName = function () {
        return this.name;
    }
}