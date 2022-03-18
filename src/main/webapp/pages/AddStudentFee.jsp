<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area | Dashboard</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
        integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
</head>

<body>

    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="/"><i class="fas fa-university"></i> SLIIT</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Welcome</a></li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </nav>

    <header id="header">
        <div class="container">
            <div class="row">
                <dbootiv class="col-md-10">
                    <h1><i class="fas fa-money-check-alt"></i> Student Fees </h1>
            </div>
        </div>
        </div>
    </header>

    <section id="breadcrumb">
        <div class="col-md-12">
            <ol class="breadcrumb">
                <li class="active">Welcome to SLIIT admin portal</li>
            </ol>
        </div>
    </section>

    <section id="main">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3 " id="sidebar">
                    <div class="list-group">
                        <!--/copy from here -->
                        <a class="list-group-item active main-color-bg">
                            <i class="fas fa-chevron-circle-down"></i> Menu
                        </a>
                        <a href="#menu1" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
                            <span class="fas fa-user-plus" aria-hidden="true"></span>
                            <span class="hidden-sm-down">Student Registration</span>
                        </a>
                        <div class="collapse" id="menu1">
                            <a href="dash" class="list-group-item" data-parent="#menu1">New Registration</a>
                            <a href="viewStudents" class="list-group-item" data-parent="#menu1">Modify
                                Registration</a>
                        </div>

                        <a href="#menu15" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
                            <span class="fas fa-chalkboard-teacher" aria-hidden="true"></span>
                            <span class="hidden-sm-down">Course Creation</span>
                        </a>
                        <div class="collapse" id="menu15">
                            <a href="course" class="list-group-item" data-parent="#menu15">Add Course</a>
                            <a href="viewCourse" class="list-group-item" data-parent="#menu15">Modify Course</a>
                        </div>

                        <a href="#menu10" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
                            <span class="fas fa-money-check-alt" aria-hidden="true"></span>
                            <span class="hidden-sm-down">Student Fees</span>
                        </a>

                        <div class="collapse" id="menu10">
                            <a href="addStudentFeePage" class="list-group-item" data-parent="#menu1">New Fee</a>
                            <a href="viewStudentFee" class="list-group-item" data-parent="#menu1">Modify Fees</a>
                        </div>

                        <a href="#menu11" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
                            <span class="fas fa-user-clock" aria-hidden="true"></span>
                            <span class="hidden-sm-down">Student Attendance</span>
                        </a>
                        <div class="collapse" id="menu11">
                            <a href="addAttendancePage" class="list-group-item" data-parent="#menu1">Add Attendance</a>
                            <a href="viewAttendance" class="list-group-item" data-parent="#menu11">Modify
                                Attendance</a>
                        </div>

                    </div>
                    <!--/copy from here -->
                    <!--/collapsible side bar end -->
                </div>

                <div class="col-md-9 content">
                    <!-- Website Overview -->

                    <div class="panel panel-default">
                        <div class="panel-heading main-color-bg">
                            <h3 class="panel-title">New Fee</h3>
                        </div>
                        <div class="panel-body">
                            <form action="addStudentFee" method="post">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <span class="input-group-addon">
                                                <lable>Registration Number</lable>
                                            </span>
                                            <input name="registrationNumber" type="text" id="text-only"
                                                class="form-control" list="studentRegistrationNumber" aria-label="..." required>
                                            <datalist id="studentRegistrationNumber">
                                            	<c:forEach items="${students}" var="StudentID">
                                            		<option value="${StudentID.registrationNumber}">
                                            	</c:forEach>
                                            </datalist>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <span class="input-group-addon">
                                                <lable>Payment
                                                    Id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                </lable>
                                            </span>
                                            <input name="paymentId" type="text" class="form-control" aria-label="..."
                                                required>
                                        </div>
                                    </div>
                                </div>
                                <br>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <span class="input-group-addon">
                                                <lable>Student
                                                    Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                </lable>
                                            </span>
                                            <input name="studentName" type="text" class="form-control" aria-label="..."
                                                list="studentNameList" required>
                                            <datalist id="studentNameList">
                                            	<c:forEach items="${students}" var="StudentNAME">
                                            		<option value="${StudentNAME.studentName}">
                                            	</c:forEach>
                                            </datalist>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <span class="input-group-addon">
                                                <lable>Payment Amount&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</lable>
                                            </span>
                                            <input name="paymentAmount" type="text" class="form-control"
                                                aria-label="..." required>
                                        </div>
                                    </div>
                                </div>
                              	<br>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="input-group">
                                            <span class="input-group-addon">
                                                <lable>Purpose Of Payment</lable>
                                            </span>
                                            <select class="form-control" name="purposeOfPayment">
                                                <option value="" disabled selected>Select Purpose of Payment</option>
                                                <option value="Registration Fee">Registration Fee</option>
                                                <option value="Semester Registration Fee">Semester Registration Fee</option>
                                                <option value="Prorata Fee">Prorata Fee</option>
                                                <option value="Repeat Exam Fee">Repeat Exam Fee</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <br>

                                <div class="row">
                                    <div class="col-md-6" id="save&rest">
                                        <button type="submit" class="btn btn-primary btn-lg btn-block"><span
                                                class="far fa-save" aria-hidden="true"></span> Save</button>
                                    </div>
                                    <div class="col-md-6" id="save&rest">
                                        <button type="reset" class="btn btn-primary btn-lg btn-block"><span
                                                class="fas fa-ban" aria-hidden="true"></span> Reset</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="panel-footer" id="myfooter">&nbsp;</div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <footer id="footer">
        <p>© 2021 - SLIIT</p>
    </footer>


    <script>
        CKEDITOR.replace('editor1');
    </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script> bootstrapValidate('text-only', 'alpha:you can only input text');</script>

</body>

</html>