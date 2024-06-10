import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.layoutId
import com.example.facturascompose.R

@Composable
fun InvoicesFilterScreen() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { },
                    navigationIcon = {
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_close),
                                contentDescription = null
                            )
                        }
                    }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(top = 56.dp, start = 20.dp, end = 20.dp)
            ) {
                val constraints = ConstraintSet {
                    val buttonUntil = createRefFor("buttonUntil")
                    val buttonFrom = createRefFor("buttonFrom")
                    val buttonApply = createRefFor("buttonApply")
                    val buttonRestart = createRefFor("buttonRestart")
                    val textView5 = createRefFor("textView5")
                    val textView4 = createRefFor("textView4")
                    val textView6 = createRefFor("textView6")
                    val textView2 = createRefFor("textView2")
                    val textView3 = createRefFor("textView3")
                    val textView7 = createRefFor("textView7")
                    val sliderCount = createRefFor("sliderCount")
                    val sliderMinValor = createRefFor("sliderMinValor")
                    val sliderMaxValor = createRefFor("sliderMaxValor")
                    val sliderSeekBar = createRefFor("sliderSeekBar")
                    val view2 = createRefFor("view2")
                    val view = createRefFor("view")
                    val checkBoxPaid = createRefFor("checkBoxPaid")
                    val checkBoxPayPlan = createRefFor("checkBoxPayPlan")
                    val checkBoxPendingPayment = createRefFor("checkBoxPendingPayment")
                    val checkBoxFixedPayment = createRefFor("checkBoxFixedPayment")
                    val checkBoxCancel = createRefFor("checkBoxCancel")

                    constrain(textView2) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    }
                    constrain(textView3) {
                        top.linkTo(textView2.bottom, margin = 40.dp)
                        start.linkTo(parent.start)
                    }
                    constrain(textView4) {
                        top.linkTo(textView3.bottom, margin = 20.dp)
                        start.linkTo(parent.start)
                    }
                    constrain(buttonFrom) {
                        top.linkTo(textView4.bottom, margin = 8.dp)
                        start.linkTo(textView4.start)
                    }
                    constrain(textView5) {
                        baseline.linkTo(textView4.baseline)
                        start.linkTo(buttonUntil.start)
                    }
                    constrain(buttonUntil) {
                        start.linkTo(buttonFrom.end, margin = 25.dp)
                        baseline.linkTo(buttonFrom.baseline)
                    }
                    constrain(view2) {
                        top.linkTo(buttonFrom.bottom, margin = 32.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    constrain(textView6) {
                        top.linkTo(view2.bottom, margin = 32.dp)
                        start.linkTo(parent.start)
                    }
                    constrain(sliderSeekBar) {
                        top.linkTo(sliderMaxValor.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    constrain(sliderCount) {
                        top.linkTo(textView6.bottom, margin = 8.dp)
                        start.linkTo(sliderSeekBar.start)
                        end.linkTo(sliderSeekBar.end)
                    }
                    constrain(sliderMinValor) {
                        top.linkTo(sliderCount.bottom)
                        start.linkTo(sliderSeekBar.start, margin = 16.dp)
                    }
                    constrain(sliderMaxValor) {
                        top.linkTo(sliderCount.bottom)
                        end.linkTo(sliderSeekBar.end, margin = 16.dp)
                    }
                    constrain(view) {
                        top.linkTo(sliderSeekBar.bottom, margin = 20.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    constrain(textView7) {
                        top.linkTo(view.bottom, margin = 32.dp)
                        start.linkTo(parent.start)
                    }
                    constrain(checkBoxPaid) {
                        top.linkTo(textView7.bottom)
                        start.linkTo(parent.start)
                    }
                    constrain(checkBoxCancel) {
                        top.linkTo(checkBoxPaid.bottom)
                        start.linkTo(parent.start)
                    }
                    constrain(checkBoxFixedPayment) {
                        top.linkTo(checkBoxCancel.bottom)
                        start.linkTo(parent.start)
                    }
                    constrain(checkBoxPendingPayment) {
                        top.linkTo(checkBoxFixedPayment.bottom)
                        start.linkTo(parent.start)
                    }
                    constrain(checkBoxPayPlan) {
                        top.linkTo(checkBoxPendingPayment.bottom)
                        start.linkTo(parent.start)
                    }
                    constrain(buttonApply) {
                        top.linkTo(checkBoxPayPlan.bottom, margin = 38.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    constrain(buttonRestart) {
                        top.linkTo(buttonApply.bottom)
                        start.linkTo(buttonApply.start)
                        end.linkTo(buttonApply.end)
                    }
                }

                ConstraintLayout(constraints, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = stringResource(id = R.string.filter_invoice),
                        color = colorResource(id = R.color.black),
                        fontSize = 27.sp,
                        modifier = Modifier.layoutId("textView2")
                    )
                    Text(
                        text = stringResource(id = R.string.issue_date),
                        color = colorResource(id = R.color.black),
                        fontSize = 17.sp,
                        modifier = Modifier.layoutId("textView3")
                    )
                    Text(
                        text = stringResource(id = R.string.filter_screen_from_text),
                        color = colorResource(id = R.color.lightGray),
                        fontSize = 16.sp,
                        modifier = Modifier.layoutId("textView4")
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.filter_screen_button_date_background_color)),
                        modifier = Modifier
                            .layoutId("buttonFrom")
                            .size(width = 131.dp, height = 56.dp)
                            .background(colorResource(id = R.color.lightGray))
                    ) {
                        Text(
                            text = stringResource(id = R.string.filter_screen_button_from_text),
                            color = colorResource(id = R.color.black),
                            fontSize = 13.sp
                        )
                    }
                    Text(
                        text = stringResource(id = R.string.filter_screen_until_text),
                        color = colorResource(id = R.color.lightGray),
                        fontSize = 16.sp,
                        modifier = Modifier.layoutId("textView5")
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.filter_screen_button_date_background_color)),
                        modifier = Modifier
                            .layoutId("buttonUntil")
                            .size(width = 133.dp, height = 55.dp)
                            .background(colorResource(id = R.color.lightGray))
                    ) {
                        Text(
                            text = stringResource(id = R.string.filter_screen_button_until_text),
                            color = colorResource(id = R.color.black),
                            fontSize = 13.sp
                        )
                    }
                    Divider(
                        color = colorResource(id = android.R.color.darker_gray),
                        thickness = 2.dp,
                        modifier = Modifier.layoutId("view2")
                    )
                    Text(
                        text = stringResource(id = R.string.filter_screen_by_ammount_text),
                        color = colorResource(id = R.color.black),
                        fontSize = 16.sp,
                        modifier = Modifier.layoutId("textView6")
                    )
                    val sliderValue = remember { mutableStateOf(0f) }
                    Slider(
                        value = sliderValue.value,
                        onValueChange = { sliderValue.value = it },
                        valueRange = 0f..100f,
                        modifier = Modifier
                            .fillMaxWidth()
                            .layoutId("sliderSeekBar")
                    )
                    Text(
                        text = stringResource(id = R.string.filter_screen_selected_ammount_counter),
                        modifier = Modifier.layoutId("sliderCount")
                    )
                    Text(
                        text = stringResource(id = R.string.filter_screen_selected_ammount_counter),
                        modifier = Modifier.layoutId("sliderMinValor")
                    )
                    Text(
                        text = stringResource(id = R.string.filter_screen_selected_ammount_counter),
                        modifier = Modifier.layoutId("sliderMaxValor")
                    )
                    Divider(
                        color = colorResource(id = android.R.color.darker_gray),
                        thickness = 2.dp,
                        modifier = Modifier.layoutId("view")
                    )
                    Text(
                        text = stringResource(id = R.string.filter_scrreen_by_status_text),
                        color = colorResource(id = R.color.black),
                        fontSize = 22.sp,
                        modifier = Modifier.layoutId("textView7")
                    )
                    CheckboxWithText(id = R.string.filter_screen_paid_text, modifier = Modifier.layoutId("checkBoxPaid"))
                    CheckboxWithText(id = R.string.filter_screen_cancelled_text, modifier = Modifier.layoutId("checkBoxCancel"))
                    CheckboxWithText(id = R.string.filter_screen_fixed_free_text, modifier = Modifier.layoutId("checkBoxFixedPayment"))
                    CheckboxWithText(id = R.string.filter_screen_pending_payment_text, modifier = Modifier.layoutId("checkBoxPendingPayment"))
                    CheckboxWithText(id = R.string.filter_screen_payment_plan_screen, modifier = Modifier.layoutId("checkBoxPayPlan"))
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .layoutId("buttonApply")
                            .size(width = 196.dp, height = 50.dp)
                    ) {
                        Text(text = stringResource(id = R.string.filter_screen_button_apply_text))
                    }
                    TextButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.layoutId("buttonRestart")
                    ) {
                        Text(
                            text = stringResource(id = R.string.filter_screen_restart_filters_button_text),
                            color = Color(0xFF9F9C9C)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CheckboxWithText(id: Int, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(vertical = 8.dp)
    ) {
        var checked by remember { mutableStateOf(false) }
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it },
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(text = stringResource(id = id), fontSize = 16.sp)
    }
}
