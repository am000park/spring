<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<article class="container py-5">
	<form action="/user/register" method="post">
		<div class="w-100 mb-3">
			<input type="text" name="id" class="form-control">
		</div>
		<div class="w-100 mb-3">
			<input type="password" name="passwd" class="form-control">
		</div>
		<div class="w-100">
			<button type="submit" class="btn btn-primary">가입</button>
		</div>
	</form>
</article>