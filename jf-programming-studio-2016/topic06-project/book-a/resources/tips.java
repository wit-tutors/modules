ICTSkills Studio 2015 Assignment Tips

Story 3

Cancel & return to Donation screen

Method 1

<!-- Snippet from EditProfile.index.html -->
<!-- Provide option to cancel and return to previous view, the donation page -->
<section class="ui segment">
  <form action="/donation" method="GET">
    <button type="submit" class="ui blue submit button">Cancel</button>
  </form>
</section>

Method 2

<button type="submit" class="ui blue submit button">Submit</button>  
<input type="button" class="ui blue submit button" value="Cancel" onClick="history.go(-1);return true;"></input>


Story 9

Filtering Report : use single template for all filters

  public static void filterCandidates(String candidateEmail)
  {
    ...
    renderTemplate("Report/index.html", donations, candidates, states, uniqueDonations);

  }

  public static void filterDonors(String donorEmail)
  {
    ...
    renderTemplate("Report/index.html", donations, candidates, states, uniqueDonations);

  }

  public static void filterStates(String state)
  {
    ...
    renderTemplate("Report/index.html", donations, candidates, states, uniqueDonations);

  }