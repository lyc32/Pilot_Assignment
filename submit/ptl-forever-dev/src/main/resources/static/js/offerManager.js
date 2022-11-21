let activeId = 1;
function openModifier(offerId, operation) {
    // set active id
    activeId = offerId;
    // get all offer information from the front page
    var userName = document.querySelector("#offerUserName" + offerId + " h4").innerHTML;
    var programName = document.querySelector("#offerProgramName" + offerId + " h4").innerHTML;
    var clientName = document.querySelector("#offerClientName" + offerId + " h4").innerHTML;
    var offerDate = document.querySelector("#offerRestInfo" + offerId + " .offerDate").innerText;
    var userExp = document.querySelector("#offerRestInfo" + offerId + " .userExp").innerHTML;
    var programDes = document.querySelector("#offerRestInfo" + offerId + " .programDes").innerHTML;
    var candidateId = document.querySelector("#offerRestInfo" + offerId + " .candidateId").innerHTML;

    // Replace value to offer modifier
    document.querySelector("#userNameFill").value = userName;
    document.querySelector("#programNameFill").value = programName;
    document.querySelector("#clientNameFill").value = clientName;
    document.querySelector("#userExpFill").value = userExp;
    document.querySelector("#offerDateFill").value = offerDate;
    document.querySelector("#programDesFill").value = programDes;

    // open modal
    $("#offerModifier").modal("show");
}

async function deleteOffer() {
    showLoadingBoard();
    $("#deleteButton").prop("disabled",true);
    // call api
    let message = await apiCall(deleteOffer, {id:activeId}, "Delete", showSuccess, showFail);
    console.log("message is :");
    console.log(message);
    //refresh page for data after
    $("#deleteButton").prop("disabled", false);

};

function showLoadingBoard() {
    document.querySelector("#boardStatus").style.display = '-webkit-box';
    document.querySelector("#statusImage").style.backgroundImage = `url("../images/loading.gif")`;
    document.querySelector("#statusText h5").innerText = "Updating please don't close";
}



showSuccess = async(message) => {
    await sleep(500);
    document.querySelector("#statusText h5").innerText = message;
    document.querySelector("#statusImage").style.backgroundImage = "url('../images/success.gif')";
    await sleep(1300);
};

showFail = async(message) => {
    await sleep(500);
    document.querySelector("#statusText h5").innerText = message;
    document.querySelector("#statusImage").style.backgroundImage = "url('../images/fail.gif')";
    await sleep(1300);
};

 apiCall = async(url, data, type, successAction, failAction) => {
    return new Promise((resolve, reject) => {
        $.ajax({
            type: "Delete",
            url: "deleteOffer",
            data: {
                id:activeId
            },
            success:  (data) => {resolve(successAction(data) )},
            fail:  (data) => {resolve(failAction(data))}
        })
    });
};

sleep = async(ms) => {
    return new Promise(resolve => setTimeout(function() {resolve()},ms));
};


