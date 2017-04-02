<form action="<c:url value="/salvae"/>">
	<fieldset>
		<label for="falha">Erros :</label>
		<textarea id="falha" name="erros">${string}</textarea>
		<button type="submit">Enviar</button>
	</fieldset>
</form>