<style>
	.navbar .dropdown-menu i {
		font-size: 16px;
		min-width: 22px;
	}
	.navbar ul.nav li.active a, .navbar ul.nav li.open > a {
		background: transparent !important;
	}	
	.navbar .nav .get-started-btn {
		min-width: 120px;
		margin-top: 8px;
		margin-bottom: 8px;
	}
	.navbar ul.nav li.open > a.get-started-btn {
		color: #fff;
		background: #31bfb1 !important;
	}
	.navbar .dropdown-menu {
		border-radius: 1px;
		border-color: #e5e5e5;
		box-shadow: 0 2px 8px rgba(0,0,0,.05);
	}
	.navbar .nav .dropdown-menu li {
		color: #999;
		font-weight: normal;
	}
	.navbar .nav .dropdown-menu li a, .navbar .nav .dropdown-menu li a:hover, .navbar .nav .dropdown-menu li a:focus {
		padding: 8px 20px;
		line-height: normal;
	}
	.navbar .navbar-form {
		border: none;
	}
	.navbar .dropdown-menu.form-wrapper {
		width: 280px;
		padding: 20px;
		left: auto;
		right: 0;
        font-size: 14px;
	}
	.navbar .dropdown-menu.form-wrapper a {		
		color: #33cabb;
		padding: 0 !important;
	}
	.navbar .dropdown-menu.form-wrapper a:hover{
		text-decoration: underline;
	}
</style>
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
  <a class="navbar-brand" href="#"><span style="color:green;font-weight:500;">B</span>ayer</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExample04">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
        <div class="dropdown-menu" aria-labelledby="dropdown04">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
    </ul>
    <!-- 
    <form class="form-inline my-2 my-md-0">
      <input class="form-control" type="text" placeholder="Search">
    </form>
    -->
    <div>
    <ul class="nav navbar-nav navbar-right">			
			<li>
          	<a data-toggle="dropdown" class="dropdown-toggle" href="#">	
				<i class="fas fa-user fa-2x"  style="color:white"></i>
					</a>
				<ul class="dropdown-menu form-wrapper">					
					<li>
						<form action="" method="post">
							<div class="form-group">
								<a href="">Your Account</a>
							</div>
							<div class="form-group">
								<a href="">Your Orders</a>
							</div>
							<div class="form-group">
								<a href="">Settings</a>
							</div>
							<div class="form-group">
								<a href="">Logout</a>
							</div>
							
						</form>
					</li>
				</ul>
			</li>
			</ul>
      </i>
    </div>
  </div>
</nav>