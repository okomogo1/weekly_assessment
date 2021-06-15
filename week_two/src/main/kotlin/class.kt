
fun main(){
    /*
    - defining classes with constructors
    - instantiate the class inside the main function
    - assign values to instance variables using setters
    - printing instance variables values using the getters
    */

    var product:Product = Product("Television",56.90 )
    product.setPrice(567.90)
    product.setTag("Electronics")
    product.setDescription("home appliances")
    println(product.Name)
    println(product.size)
    println(product.getPrice())
    println(product.getDecription())
    println(product.getTag())

    var student:Student = Student("Okom Timothy")
    student.setRegNo("ihub-3773")
    student.setDepartment("informatics")
    student.setLevel("300L")
    student.setYearEntry(2021)
    println(student.Name)
    println(student.getDepartment())
    println(student.getLevel())
    println(student.getRegNo())
    println(student.getYearEntry())

    var staff:Staff = Staff("Ojo")
    staff.setRegNo("HOS-9552")
    staff.setDepartment("informatics")
    staff.setLevel(4)
    staff.setGrade(2)

    println(staff.Name)
    println(staff.getDepartment())
    println(staff.getLevel())
    println(staff.getStaffNo())
    println(staff.getgrade())

    var transaction:Transaction = Transaction(67687687678)
    transaction.setId(1)
    transaction.setReceiverAccount(0141828955)
    transaction.setReceiverBank("Gtbank")
    transaction.setAmount(5000.90)

    println(transaction.getId())
    println(transaction.getAmount())
    println(transaction.getReceiverAccount())
    println(transaction.getReceiverBank())
    println(transaction.souceAccount)

    var salesPos:SalesPos = SalesPos("Laptop","SALEUSER-908")
    salesPos.setId(1)
    salesPos.setAmount(67.00)
    salesPos.setreceiverName("Okom Blessing")

    println(salesPos.getId())
    println(salesPos.getAmount())
    println(salesPos.getReceiverName())
    println(salesPos.productName)
    println(salesPos.salesPersonId)



}

class Product {
    var Name:String =""
    private var price:Double=0.00
    private var description:String =""
    var size: Double = 0.0
    private var tag: String = ""
    constructor(nname:String, size:Double=0.00){
        this.Name =nname
        this.size = size
    }
    fun setPrice(price:Double){
        this.price = price
    }
    fun setDescription(description:String){
        this.description = description
    }
    fun setTag(tag:String){
        this.tag = tag
    }

    fun getPrice():Double{
        return this.price
    }
    fun getDecription():String{
        return this.description
    }
    fun getTag():String{
        return this.tag
    }

}

class Student {
    var Name:String =""
    private var regNo:String=""
    private var department:String =""
    private var level:String = ""
    private var yearOfEntry: Int =0
    constructor(name:String){
        this.Name =name
    }
    fun setRegNo(regno:String){
        this.regNo = regno
    }
    fun setDepartment(department:String){
        this.department = department
    }
    fun setLevel(level:String){
        this.level = level
    }
    fun setYearEntry(yearEntry:Int){
        this.yearOfEntry = yearEntry
    }

    fun getRegNo():String{
        return this.regNo
    }
    fun getDepartment():String{
        return this.department
    }
    fun getLevel():String{
        return this.level
    }
    fun getYearEntry():Int{
        return this.yearOfEntry
    }

}

class Staff {
    var Name:String =""
    private var staffNo:String=""
    private var department:String =""
    private var level:Int = 0
    private var grade: Int =0
    constructor(name:String){
        this.Name =name
    }
    fun setRegNo(staffno:String){
        this.staffNo = staffno
    }
    fun setDepartment(department:String){
        this.department = department
    }
    fun setLevel(level:Int){
        this.level = level
    }
    fun setGrade(grade:Int){
        this.grade = grade
    }

    fun getStaffNo():String{
        return this.staffNo
    }
    fun getDepartment():String{
        return this.department
    }
    fun getLevel():Int{
        return this.level
    }
    fun getgrade():Int{
        return this.grade
    }

}

class Transaction {
    private var Id:Int =0
    var souceAccount:Long =0
    private var amount:Double=0.00
    private var receiverAccount:Long = 0
    private var receiverBank: String =""
    constructor(sourceAccount:Long){
        this.souceAccount =sourceAccount
    }
    fun setAmount(amount:Double){
        this.amount = amount
    }
    fun setReceiverAccount(receiverAccount:Long){
        this.receiverAccount = receiverAccount
    }
    fun setReceiverBank(receiverBank:String){
        this.receiverBank = receiverBank
    }
    fun setId(id:Int){
        this.Id = id
    }

    fun getAmount():Double{
        return this.amount
    }
    fun getReceiverAccount():Long{
        return this.receiverAccount
    }
    fun getReceiverBank():String{
        return this.receiverBank
    }
    fun getId():Int{
        return this.Id
    }

}

class SalesPos {
    private var Id:Int =0
    var productName:String =""
    private var amount:Double=0.00
    var salesPersonId:String =""
    private var receiverName: String =""
    constructor(productName:String, salesPersonId: String){
        this.productName =productName
        this.salesPersonId = salesPersonId
    }
    fun setAmount(amount:Double){
        this.amount = amount
    }
    fun setreceiverName(receiverAccount:String){
        this.receiverName = receiverName
    }

    fun setId(id:Int){
        this.Id = id
    }

    fun getAmount():Double{
        return this.amount
    }
    fun getReceiverName():String{
        return this.receiverName
    }

    fun getId():Int{
        return this.Id
    }

}