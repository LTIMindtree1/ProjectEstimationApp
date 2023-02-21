<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
  <link rel="stylesheet" href="" th:href="@{/Homepage.css}">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="" th:src="@{/Home.js}"></script>

  


  <style>

  </style>
</head>

<body>
  <div class="banner">fkdhjsflkfsd</div>
  <div class="maincontainer">
    <div class="form-page">
      <form>
        <table>
          <caption>Prospect Details</caption>
          <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
          </tr>
          <tr>
            <td>Region</td>
            <td><input type="text" name="region"></td>
          </tr>
          <tr>
            <td>BSG Contact</td>
            <td><input type="text" name="bsgcontact"></td>
          </tr>
          <tr>
            <td>PDM contact</td>
            <td><input type="text" name="pdmcontact"></td>
          </tr>
          <tr>
            <td>Tfocus ID</td>
            <td><input type="text" name="tfocus"></td>
          </tr>
          <tr>
            <td>CEM Team(Manager,TFT)</td>
            <td><input type="text" name="cemteam"></td>
          </tr>
        </table>
      </form>
    </div>

    <div class="checkvalue">
      <table>
        <caption>channels</caption>
        <tr>
          <td>Mobile</td>
          <td><input type="checkbox" name="mobile" value="Mobile"></td>
        </tr>
        <tr>
          <td>Tablets</td>
          <td><input type="checkbox" name="tablets" value="Tablets"></td>
        </tr>
        <tr>
          <td>Responsive Web</td>
          <td><input type="checkbox" name="web" value="Responsive Web"></td>
        </tr>
      </table>
      <br />
      <table>
        <caption>Language</caption>
        <tr>
          <td>LTR</td>
          <td> <select>
              <option value="0">0</option>
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
            </select></td>
        </tr>
        <tr>
          <td>RTL</td>
          <td>
            <select>
              <option value="0">0</option>
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
            </select>
          </td>
        </tr>
      </table>

      <table>
        <caption>Production Selection</caption>
        <tr>
          <td>Retail Banking</td>
          <td><input type="checkbox" name="retail" value="Retail Banking"></td>
        </tr>
        <tr>
          <td>SME Banking</td>
          <td><input type="checkbox" name="sme" value="SME Banking"></td>
        </tr>
      </table>

    </div>

  </div>
  <div style="float:right"> <button type="button" id="idBtnNext">Next</button></div>
  <div class="secondcontainer">
    <table>
      <tr>
        <th>id </th>
        <th>Module Name </th>
        <th>Sub Module Name </th>
        <th>Product Mapping </th>
        <th>Channel </th>
      </tr>

    </table>
  </div>
</body>

</html>